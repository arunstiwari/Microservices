Kubernetes Setup
---
1. Easiest way to create a Kubernetes cluster at scale is using Google Cloud Platform at  https://cloud.google.com/container-engine

2. Building Kubernetes Cluster on our local machine using Docker

3. Several options exist to run a Dockerized Kubernetes cluster like 

	1. Buidling your own Docker compose file
	2. Using kid (kid stands for Kubernetes in Docker. It is a third party script that will spin off kubernetes cluster using Docker )
	3. Minikube
	
4. For local setup we will be using minikube and kubectl to orchestrate and manage our local single-node Kubernetes cluster

	kubectl is a CLI for managing Kubernetes clusters
	
5. Prerequisites:

	1. Oracle Virtualbox should be installed on the local machine if we are using docker-machine
	2. If we are using native docker then we might have to install the latest version of VirtualBox
	
6. Installing Minikube

6.1 Open a terminal window and execute the following command

	curl -Lo minikube https://storage.googleapis.com/minikube/releases/v0.12.0/minikube-darwin-amd64 && chmod +x minikube && sudo mv minikube /usr/local/bin/
	
		This command does three things
		a) Download the minikube package
		b) Add execute permission to the minikube binary file for all users
		c) Move the minikube binary file to /usr/local/bin

6.2 Verify minikube installation by executing the following command

	$ minikube
		
7. Installing Kubectl

7.1 Open a terminal window and execute the following command

	url -LO https://storage.googleapis.com/kubernetes-release/release/$(curl -s https://storage.googleapis.com/kubernetes-release/release/stable.txt)/bin/darwin/amd64/kubectl && chmod +x ./kubectl && sudo mv ./kubectl /usr/local/bin/kubectl
	
7.2 Verify kubectl installation by executing the following command

	$ kubectl
	
8. Creating First Cluster
8.1 Execute the following command from the terminal

	$ minikube start

8.2 Verfiy the minikube cluster by following the command

	$ eval $(minikube docker-env)
	
	$ docker ps
	
	$ minikube status
	
8.3 You can stop the minikube cluster using the following command 

	$ minikube stop


	
