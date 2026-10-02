import subprocess

host = input("Enter host: ")

command = f"ping -c 1 {host}"

result = subprocess.run(
    command,
    shell=True,
    capture_output=True,
    text=True
)

print(result.stdout)