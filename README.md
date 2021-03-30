# Simple Logging Service

Start with `sbt "run 8000"`

Logs will be accepted as `POST /log/:user/:event/:data` 
e.g.    
`curl -X POST localhost:8000/log/auser/new/admin,read`

Audit log will be sent to `logs/audit.log`