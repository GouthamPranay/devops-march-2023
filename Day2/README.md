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


## Lab - Listing the docker images in your local docker registry
```
docker images
```
Expected output
<pre>
 jegan@tektutor.org $ docker images
REPOSITORY                                TAG       IMAGE ID       CREATED         SIZE
docker.bintray.io/jfrog/artifactory-oss   latest    1b425cceed92   2 days ago      1.51GB
tektutor/centos-ansible-node              latest    c98813da9ef4   3 weeks ago     457MB
tektutor/ubuntu-ansible-node              latest    7169bf3260b9   3 weeks ago     228MB
gcr.io/k8s-minikube/kicbase               v0.0.37   01c0ce65fff7   2 months ago    1.15GB
centos                                    centos7   eeb6ee3f44bd   18 months ago   204MB
ubuntu                                    16.04     b6f507652425   19 months ago   135MB
</pre>

## Lab - Finding more details about a docker image
```
docker image inspect docker.bintray.io/jfrog/artifactory-oss
```

Expected output
<pre>
jegan@tektutor.org  ~  docker image inspect docker.bintray.io/jfrog/artifactory-oss
[
    {
        "Id": "sha256:1b425cceed925e92ecae539ffcab42e4821e709e15c45484178c6458c6f4a250",
        "RepoTags": [
            "docker.bintray.io/jfrog/artifactory-oss:latest"
        ],
        "RepoDigests": [
            "docker.bintray.io/jfrog/artifactory-oss@sha256:201428295c897d0f1eba95ecf714b4bc8e23146098fffbc2ffe6c467099fdfc6"
        ],
        "Parent": "",
        "Comment": "buildkit.dockerfile.v0",
        "Created": "2023-03-26T11:24:16.520015225Z",
        "Container": "",
        "ContainerConfig": {
            "Hostname": "",
            "Domainname": "",
            "User": "",
            "AttachStdin": false,
            "AttachStdout": false,
            "AttachStderr": false,
            "Tty": false,
            "OpenStdin": false,
            "StdinOnce": false,
            "Env": null,
            "Cmd": null,
            "Image": "",
            "Volumes": null,
            "WorkingDir": "",
            "Entrypoint": null,
            "OnBuild": null,
            "Labels": null
        },
        "DockerVersion": "",
        "Author": "",
        "Config": {
            "Hostname": "",
            "Domainname": "",
            "User": "artifactory",
            "AttachStdin": false,
            "AttachStdout": false,
            "AttachStderr": false,
            "ExposedPorts": {
                "8081/tcp": {}
            },
            "Tty": false,
            "OpenStdin": false,
            "StdinOnce": false,
            "Env": [
                "PATH=/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin",
                "JF_ARTIFACTORY_USER=artifactory",
                "ARTIFACTORY_VERSION=7.55.9",
                "LIBAIO_VERSION=0.3.113-1",
                "ARTIFACTORY_BOOTSTRAP=/artifactory_bootstrap",
                "JF_PRODUCT_HOME=/opt/jfrog/artifactory",
                "JF_PRODUCT_DATA_INTERNAL=/var/opt/jfrog/artifactory",
                "RECOMMENDED_MAX_OPEN_FILES=32000",
                "MIN_MAX_OPEN_FILES=10000",
                "RECOMMENDED_MAX_OPEN_PROCESSES=1024",
                "TARGETARCH=amd64"
            ],
            "Cmd": null,
            "Image": "",
            "Volumes": {
                "/var/opt/jfrog/artifactory": {}
            },
            "WorkingDir": "/opt/jfrog/artifactory",
            "Entrypoint": [
                "/entrypoint-artifactory.sh"
            ],
            "OnBuild": null,
            "Labels": {
                "architecture": "x86_64",
                "build-date": "2023-01-17T14:19:54",
                "com.redhat.component": "ubi9-micro-container",
                "com.redhat.license_terms": "https://www.redhat.com/en/about/red-hat-end-user-license-agreements#UBI",
                "description": "Very small image which doesn't install the package manager.",
                "distribution-scope": "public",
                "io.buildah.version": "1.27.1",
                "io.k8s.description": "Very small image which doesn't install the package manager.",
                "io.k8s.display-name": "Ubi9-micro",
                "io.openshift.expose-services": "",
                "maintainer": "devops@jfrog.com",
                "name": "ubi9/ubi-micro",
                "release": "13",
                "summary": "ubi9 micro image",
                "url": "https://access.redhat.com/containers/#/registry.access.redhat.com/ubi9/ubi-micro/images/9.1.0-13",
                "vcs-ref": "c563e091e0c7bd5a69b2a46990dda4f59595aa37",
                "vcs-type": "git",
                "vendor": "Red Hat, Inc.",
                "version": "9.1.0"
            }
        },
        "Architecture": "amd64",
        "Os": "linux",
        "Size": 1507787129,
        "VirtualSize": 1507787129,
        "GraphDriver": {
            "Data": {
                "LowerDir": "/var/lib/docker/overlay2/9dfd0a0b28ffd778630bd911d043035aa4f302b757c9648058dc7482c872e787/diff:/var/lib/docker/overlay2/1f2153fdec8eb662c3aee56c90d2cefeeaa95f9039dfba8a7399fb125a6f7dd7/diff:/var/lib/docker/overlay2/a081c2e7d184549b6240adc748c5c99050c488877b7128a4ca1e042f372d031d/diff:/var/lib/docker/overlay2/229de58cb3ea810a32fd568ccf42e6df49886d809000d8144dbd9fe21e56ccb6/diff:/var/lib/docker/overlay2/4a36ae2cd119a780600866d3fc231b591800b650fc6f0067112a477a51a5c248/diff:/var/lib/docker/overlay2/50e2f707e8a2f12c6d6ebb533df1e32db2d66d4a6c54108a0976e6874a4649ac/diff:/var/lib/docker/overlay2/99e1a55511e88f8a1c824285d2168ab1f6dc23ff9b8cd43667c4bb04f07de12c/diff:/var/lib/docker/overlay2/71e6578db6cf21268a72abb4ea22d4cfd11c41ce59e9a49e496e0f326e527802/diff:/var/lib/docker/overlay2/2293dbf1ce30d83f7daac478b13f05834ba243f5caaadde127dc033c9897ae7c/diff:/var/lib/docker/overlay2/a6729d187d8974709a29996357c9ab3a57a5188d1f507adf615fe39f93fbb38e/diff",
                "MergedDir": "/var/lib/docker/overlay2/1c52790fbe5d97edb3fb7ea6d2c3b89f134adb30c5d3e560d9b7d875adf030bb/merged",
                "UpperDir": "/var/lib/docker/overlay2/1c52790fbe5d97edb3fb7ea6d2c3b89f134adb30c5d3e560d9b7d875adf030bb/diff",
                "WorkDir": "/var/lib/docker/overlay2/1c52790fbe5d97edb3fb7ea6d2c3b89f134adb30c5d3e560d9b7d875adf030bb/work"
            },
            "Name": "overlay2"
        },
        "RootFS": {
            "Type": "layers",
            "Layers": [
                "sha256:a4c04ef9f22efacfeef90de7240e03c302e7a18b0ed902f8a3e845ff96147e51",
                "sha256:2c9fd352aa6c1336912749e6b613a321492a94b8ff66a80cae0990ee5d509ac2",
                "sha256:9c228b073eb781d01e452055d825ee2f72228d8a9f4bcbcdcd85c2a019acad1b",
                "sha256:efc217f7a7c85944d6b34ef9204925bab9ef355a185022be5010fa06058eb38b",
                "sha256:5073167ff8bf1bb156813f78adbfae78d848ef7147b85f5d80faa65a94b4e7d6",
                "sha256:5f70bf18a086007016e948b04aed3b82103a36bea41755b6cddfaf10ace3c6ef",
                "sha256:8851ad098a1e5b50c3c438918aaf2b3bd05f6873b14eeb5ebd9e1281e82711d8",
                "sha256:b46b989987f871171b659a6612e9e3d9dc62ec326c37dca1229042b93e528bbe",
                "sha256:257512b6e6b96e24062b024ded82588159813d52cfee8598cf671fe496b58f94",
                "sha256:a4b86dc21d4076600961c33566fdbe4f0f7402f8ad40fc048707ba836a7d6c15",
                "sha256:5f70bf18a086007016e948b04aed3b82103a36bea41755b6cddfaf10ace3c6ef"
            ]
        },
        "Metadata": {
            "LastTagTime": "0001-01-01T00:00:00Z"
        }
    }
]
</pre>

## Lab - Download Docker Image from Docker Hub(Remote Registry) to Local Docker Registry
```
docker pull busybox:latest
```

Expected output
<pre>
jegan@tektutor.org $ docker pull busybox:latest
latest: Pulling from library/busybox
4b35f584bb4f: Pull complete 
Digest: sha256:b5d6fe0712636ceb7430189de28819e195e8966372edfc2d9409d79402a0dc16
Status: Downloaded newer image for busybox:latest
docker.io/library/busybox:latest

jegan@tektutor.org $ docker images
REPOSITORY                                TAG       IMAGE ID       CREATED         SIZE
docker.bintray.io/jfrog/artifactory-oss   latest    1b425cceed92   2 days ago      1.51GB
busybox                                   latest    7cfbbec8963d   11 days ago     4.86MB
tektutor/centos-ansible-node              latest    c98813da9ef4   3 weeks ago     457MB
tektutor/ubuntu-ansible-node              latest    7169bf3260b9   3 weeks ago     228MB
gcr.io/k8s-minikube/kicbase               v0.0.37   01c0ce65fff7   2 months ago    1.15GB
centos                                    centos7   eeb6ee3f44bd   18 months ago   204MB
ubuntu                                    16.04     b6f507652425   19 months ago   135MB
</pre>

## Removing an image from local registry
```
docker rmi busybox:latest
```

## Creating your first docker container
```
docker run -dit --name ubuntu1 --hostname ubuntu1 ubuntu:22.04 /bin/bash
```

Expected output
<pre>
jegan@tektutor.org $ docker run -dit --name ubuntu1 --hostname ubuntu1 ubuntu:22.04 /bin/bash
Unable to find image 'ubuntu:22.04' locally
22.04: Pulling from library/ubuntu
2ab09b027e7f: Pull complete 
Digest: sha256:67211c14fa74f070d27cc59d69a7fa9aeff8e28ea118ef3babc295a0428a6d21
Status: Downloaded newer image for ubuntu:22.04
5d9611eb44157f3ef85f10545b0528a0ee4a695ea428dd347b03e9f86d467bf4

jegan@tektutor.org $ docker ps
CONTAINER ID   IMAGE          COMMAND       CREATED         STATUS         PORTS     NAMES
5d9611eb4415   ubuntu:22.04   "/bin/bash"   4 seconds ago   Up 4 seconds             ubuntu1

jegan@tektutor.org $ docker exec -it ubuntu1 bash
root@ubuntu1:/# ifconfig
bash: ifconfig: command not found
root@ubuntu1:/# exit         
exit
</pre>

## Create bunch of container in background
```
docker run -dit --name ubuntu2 --hostname ubuntu2 ubuntu:22.04 /bin/bash
docker run -dit --name ubuntu3 --hostname ubuntu3 ubuntu:22.04 /bin/bash
```

## Deleting a running container forcibly
```
docker rm -f ubuntu1
docker rm -f ubuntu2 ubuntu3
```

## Deleting a running container gracefully
```
docker stop ubuntu1
docker stop ubuntu2 ubuntu3
docker rm ubuntu1 
docker rm ubuntu2 ubuntu3
```

