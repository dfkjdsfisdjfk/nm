# 

## Model
www.msaez.io/#/storming/62131378_es_nm

## Before Running Services
### Make sure there is a Kafka server running
```
cd kafka
docker-compose up
```
- Check the Kafka messages:
```
cd infra
docker-compose exec -it kafka /bin/bash
cd /bin
./kafka-console-consumer --bootstrap-server localhost:9092 --topic
```

## Run the backend micro-services
See the README.md files inside the each microservices directory:

- inspecticmp
- registration
- inspecthttp
- inspectdns
- management


## Run API Gateway (Spring Gateway)
```
cd gateway
mvn spring-boot:run
```

## Test by API
- inspecticmp
```
 http :8088/icmpData id="id" obj="obj" objDetail="obj_detail" state="state" endedDate="ended_date" resultData="result_data" 
```
- registration
```
 http :8088/inputInfos id="id" clientName="client_name" createDate="create_date" clientEquips="clientEquips" 
```
- inspecthttp
```
 http :8088/icmpData id="id" obj="obj" objDetail="obj_detail" state="state" endedDate="ended_date" resultData="result_data" 
```
- inspectdns
```
 http :8088/icmpData id="id" obj="obj" objDetail="obj_detail" state="state" endedDate="ended_date" resultData="result_data" 
```
- management
```
 http :8088/clients id="id" createDate="create_date" modifiDate="modifi_date" clientName="client_name" stateReq="state_req" stateDns="state_dns" stateEtn="state_etn" lastInspectDate="last_inspect_date" device="device" 
```


## Run the frontend
```
cd frontend
npm i
npm run serve
```

## Test by UI
Open a browser to localhost:8088

## Required Utilities

- httpie (alternative for curl / POSTMAN) and network utils
```
sudo apt-get update
sudo apt-get install net-tools
sudo apt install iputils-ping
pip install httpie
```

- kubernetes utilities (kubectl)
```
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
```

- aws cli (aws)
```
curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
unzip awscliv2.zip
sudo ./aws/install
```

- eksctl 
```
curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
sudo mv /tmp/eksctl /usr/local/bin
```

