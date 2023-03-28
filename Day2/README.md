# Day 2

## What is Hypervisor?
- nothing but virtualization technology
- allows running multiple OS side by side on the same laptop/desktop/workstation/server
- there are 2 types
  1. Type1
     - used in Workstations/Servers
     - bare-metal Hypervisor
     - doesn't require Host OS, hence can be installed directly on a bare server with no OS
     - examples - VMWare vCenter/vSphere
  2. Type2
     - used in Laptops/Desktops/Workstations
     - this works on top of an existing OS (Host OS - Windows, Unix, Linux, Mac OS-X)
     - examples - VMWare Workstation, VMWare Fusion Oracle VirtualBox, Parallels, Microsoft Hyper-V, KVM
- within Virtual Machines you can install any OS ( Windows, Unix, Linux, Mac OS-X)
- each Virtual machine represents a fully functional Operating System
- each OS withint the virtual machines has its own dedicated OS Kernel
- Virtual Machines(VMs) are also as Guest OS
- each Virtual Machines get its own dedicated hardware resources
  - CPU Cores
  - RAM
  - Storage (HDD/SDD)
- hence this type of Virtualization is called as Heavy-weight Virtualization
- Processors (AMD or Intel)
  Intel Processor
  - virtualization feature is called VT-X
  AMD Processor
  - virtualization feature is called AMD-V
  
## What are Containers?
- light-weight virtualization
- containers are nothing but application process
- application virtualization technology
- is not an OS it is merely an application process
- for OS kernel related functionalities, containers depends on the Host OS Kernel
- technically containers runs on the Host OS kernel
- each containers runs in a separate namespace
- Linux Kernel
  1. Namespace - used to isolate one container from other container
  2. Control Groups (CGroups) - used to apply resource quota restrictions

## Containers vs Hypervisor
- each container represents one application while each VM represents one Operating system
- containers doesn't have OS Kernel but VMs have their own OS Kernel
- container doesn't get their own dedicated hardware but VMs get their own dedicated hardware resources
- both container and VMS have their own Network stack, IP address and File system

## What is a Container Engine?
- a high-level software that depends on Container runtimes to manage containers
- provides user-friendly commands to manage container images and containers
- these are the tools which are used by end-user like us
- examples
  - Docker
  - Podman

## What is a Container Runtime?
- is the utility that manages containers
  - creates a container
  - runs the containers
  - start/stop/restart a container
  - kill/delete container
- these are low-level tools which are normally used by Container Engines
- depends os kernel to create and manage containers
- these are not directly used by end-users
- examples
  - runC
  - LXC
  - containerd
  - CRI-O

## What are Container Orchestration Tools?
- it is a software that manage containers
- examples
  1. Docker SWARM
  2. Google Kubernetes
  3. RedHat OpenShift


# Docker commands

## Lab - Finding docker version
```
docker version
```

Expected output
<pre>
jegan@tektutor.org $ <b>docker --version</b>
Docker version 20.10.21, build 20.10.21-0ubuntu1~22.04.2
</pre>

## Lab - Print docker info
```
docker info
```

Expected output
<pre>
 jegan@tektutor.org  ~  docker info
Client:
 Context:    default
 Debug Mode: false

Server:
 Containers: 11
  Running: 0
  Paused: 0
  Stopped: 11
 Images: 27
 Server Version: 20.10.21
 Storage Driver: overlay2
  Backing Filesystem: extfs
  Supports d_type: true
  Native Overlay Diff: true
  userxattr: false
 Logging Driver: json-file
 Cgroup Driver: systemd
 Cgroup Version: 2
 Plugins:
  Volume: local
  Network: bridge host ipvlan macvlan null overlay
  Log: awslogs fluentd gcplogs gelf journald json-file local logentries splunk syslog
 Swarm: inactive
 Runtimes: io.containerd.runc.v2 io.containerd.runtime.v1.linux runc
 Default Runtime: runc
 Init Binary: docker-init
 containerd version: 
 runc version: 
 init version: 
 Security Options:
  apparmor
  seccomp
   Profile: default
  cgroupns
 Kernel Version: 5.19.0-35-generic
 Operating System: Ubuntu 22.04.2 LTS
 OSType: linux
 Architecture: x86_64
 CPUs: 48
 Total Memory: 125.5GiB
 Name: tektutor.org
 ID: 7TE4:VNOO:74TD:26WF:VH3Q:FQIN:LIM6:YVQV:RJ63:MY2C:A6ZL:VT33
 Docker Root Dir: /var/lib/docker
 Debug Mode: false
 Registry: https://index.docker.io/v1/
 Labels:
 Experimental: false
 Insecure Registries:
  127.0.0.0/8
 Live Restore Enabled: false
</pre>
