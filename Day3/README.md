# Day 3

## What is Configuration Management Tool?
- helps us automate the software installation in an existing Virtual Machine or OS
- i.e if you have provisioned machine with OS pre-installed, configuration management tools can help you install softwares onto those machines


## What is Ansible?
- it is an opensource tool developed by Michael Deehan in Python
- Michael Deehan was former employee of Red Hat, he was working on a similar configuration management tool which was then decomissioned so he had quit Red Hat and started his own company called Ansible Inc
- Michael Deehan along with the world-wide opensource community, he developed Ansible Core as open source
- Red Hat acquired Ansible Inc, and then Red Hat got acquired by IBM
- Today, Ansible comes in 3 flavours
  - Ansible Core 
    - open source
    - supports only Command line
    - doesn't support different users
    - production grade
   
  - AWX 
    - open sources
    - developed on top of opensource Ansible core
    - supports user management, teams
    - supports web interface
    - you don't get any support as it is opensource product
    - production grade
    - you may check my medium blog for step by step installation instructions here https://medium.com/@jegan_50867/installing-ansible-tower-awx-e46d5231357d
    
  - Red Hat Ansible Tower
    - you get world-wide support from Red Hat (an IBM company)
    - it is built on top of the opensource product called AWX
    - also supports web interface as it is based on AWX
    - production grade
 
## Ansible Alternatives
- Puppet
- Chef
- Salt/SaltStack

# Ansible Commands

## Checking the version of Ansible installed
```
ansible --version
```

Expected output
<pre>
jegan@tektutor.org $ ansible --version
ansible 2.10.8
  config file = None
  configured module search path = ['/home/jegan/.ansible/plugins/modules', '/usr/share/ansible/plugins/modules']
  ansible python module location = /usr/lib/python3/dist-packages/ansible
  executable location = /usr/bin/ansible
  python version = 3.10.6 (main, Mar 10 2023, 10:55:28) [GCC 11.3.0]
</pre>
