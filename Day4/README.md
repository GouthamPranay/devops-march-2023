# Day 4

## Setup Maven
```
cd ~/Downloads
wget https://dlcdn.apache.org/maven/maven-3/3.9.1/binaries/apache-maven-3.9.1-bin.tar.gz
tar xvfz apache-maven-3.9.1-bin.tar.gz
cd apache-maven-3.9.1
pwd
```

Edit your ~/.bashrc file and append the below lines at the end of the file
```
export M2_HOME=~/Downloads/apache-maven-3.9.1
export PATH=$M2_HOME/bin:$PATH
```

To apply the bashrc file changes, we need to source the bashrc as shown below
```
source ~/.bashrc
mvn --version
```

## Setup JDK 18
```
cd ~/Downloads
sudo yum install -y curl wget

curl -O https://download.java.net/java/GA/jdk18/43f95e8614114aeaa8e8a5fcf20a682d/36/GPL/openjdk-18_linux-x64_bin.tar.gz

tar xvf openjdk-18_linux-x64_bin.tar.gz

sudo mv jdk-18 /opt/
```
