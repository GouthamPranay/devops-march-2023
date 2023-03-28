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
