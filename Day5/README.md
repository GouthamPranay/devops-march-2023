# Day 5

## ⛹️‍♂️ Lab - Creating a Freestyle Jenkins Job

![Freestyle Jenkins Job](freestyle-1.png)
![Freestyle Jenkins Job](freestyle-2.png)
![Freestyle Jenkins Job](freestyle-3.png)
![Freestyle Jenkins Job](freestyle-4.png)
![Freestyle Jenkins Job](freestyle-5.png)
![Freestyle Jenkins Job](freestyle-6.png)
![Freestyle Jenkins Job](freestyle-7.png)
![Freestyle Jenkins Job](freestyle-8.png)

## ⛹️‍♂️ Lab - Invoking Ansible Playbook from a Jenkins Freestyle Job
Create a FreeStyle named "InvokeAnsiblePlaybook" copying the HelloFreeStyleJob. The only change is in the Execute Shell section as shown below
![Invoke Ansible Playbook](invoke-ansible-playbook-shell.png)

## ⛹️‍♂️ Lab - Invoking Ansible Playbook from a Jenkins Freestyle Job using Jenkins Ansible Plugin
Create a FreeStyle named "InvokeAnsiblePlaybookUsingAnsiblePlugin" copying the HelloFreeStyleJob. The only change is in the Execute Shell section as shown below
![Invoke Ansible Playbook](invoke-ansible-playbook-using-ansible-plugin.png)

# ⛹️‍♂️ Lab - Jenkins Performance Monitoring using Prometheus and plotting performance metrics using Grafana Visualization Dashboard

## Setup Prometheus
In you Jenkins, you need to install Prometheus Metrics Plugin.  After installing, you can verify prometheus REST endpoint URL from your web browser
```
http://localhost:8080/prometheus
```

Expected output

Installing Prometheus Metrics Plugin in Jenkins
![Prometheus Metrics](prometheus-3.png)
![Prometheus Metrics](prometheus-4.png)

Accessing Prometheus Metrics from the Prometheus Metrics REST endpoint URL
<pre>
http://localhost:8080/prometheus
</pre>
![Prometheus Metrics](prometheus-5.png)

Creating Prometheus container
<pre>
docker run --name prometheus --hostname prometheus -p 9090:9090 bitnami/prometheus:latest
</pre>
![Prometheus Metrics](prometheus-1.png)

Accessing Prometheus Dashboard
<pre>
http://localhost:9090
</pre>
![Prometheus Metrics](prometheus-2.png)

## Setup Grafana

Create Grafana container
<pre>
docker run -d --name=grafana -p 3000:3000 grafana/grafana
</pre>
![Grafana](grafana-1.png)

Accessing Grafana Dashboard
<pre>
http://localhost:3000
</pre>
Login to Grafana Dashboard with default credentials
<pre>
username - admin
password - admin
</pre>
![Grafana](grafana-2.png)


Change the Grafana Dashboard password
<pre>
username - admin
password - Admin@123
</pre>

![Grafana](grafana-3.png)


Grafana Dashboard looks like this
![Grafana](grafana-4.png)
