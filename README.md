# Claude Code Schulung

Materialien zur Schulung Claude Code.

## Setup-Check

Prüft, ob Git, JDK 21 und der Maven-Build auf Ihrem Rechner laufen. Maven müssen Sie nicht installieren, der Wrapper lädt es selbst.

```powershell
git clone https://github.com/grigory-consulting/claude-code-schulung.git
cd claude-code-schulung
.\mvnw.cmd test
```

Unter macOS oder Linux heißt der letzte Befehl `./mvnw test`.

Der Check ist bestanden, wenn am Ende `BUILD SUCCESS` steht.
