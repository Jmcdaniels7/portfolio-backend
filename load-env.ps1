# load-env.ps1
# Loads key=value pairs from .env file into environment variables for current session

$envFile = ".env"

if (Test-Path $envFile) {
    Get-Content $envFile | ForEach-Object {
        if ($_ -match "^\s*#") { return }       # Skip comments
        if ($_ -match "^\s*$") { return }       # Skip empty lines

        $parts = $_ -split '=', 2
        if ($parts.Length -eq 2) {
            $key = $parts[0].Trim()
            $value = $parts[1].Trim()
            ${env:$key} = $value

            if ($key -like "*PASSWORD*" -or $key -like "*SECRET*") {
                # Do NOT print sensitive values
                Write-Host "Set $key=******"
            } else {
                # Print non-sensitive keys with actual values
                Write-Host "Set $key=$value"
            }
        }
    }
} else {
    Write-Host ".env file not found!"
}

