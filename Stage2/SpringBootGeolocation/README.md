#Kubernetes Setup

##### 1. Easiest way to create a Kubernetes cluster at scale is using Google Cloud Platform at  https://cloud.google.com/container-engine

#####2. Building Kubernetes Cluster on our local machine using Docker

#####3. Several options exist to run a Dockerized Kubernetes cluster like 
	1. Buidling your own Docker compose file
	2. Using kid (kid stands for Kubernetes in Docker. It is a third party script that will spin off kubernetes cluster using Docker )
	3. Minikube
	
#####4. Local setup 
		we will be using minikube and kubectl to orchestrate and manage our local single-node Kubernetes cluster
		kubectl is a CLI for managing Kubernetes clusters
	
#####5. Prerequisites:
	1. Oracle Virtualbox should be installed on the local machine if we are using docker-machine
	2. If we are using native docker then we might have to install the latest version of VirtualBox

####6. Installing Minikube
---------
######6.1 Open a terminal window and execute the following command
	curl -Lo minikube https://storage.googleapis.com/minikube/releases/v0.12.0/minikube-darwin-amd64 && chmod +x minikube && sudo mv minikube /usr/local/bin/
	
		This command does three things
		a) Download the minikube package
		b) Add execute permission to the minikube binary file for all users
		c) Move the minikube binary file to /usr/local/bin

######6.2 Verify minikube installation by executing the following command
	$ minikube
		
####7. Installing Kubectl
-----------
######7.1 Open a terminal window and execute the following command
	url -LO https://storage.googleapis.com/kubernetes-release/release/$(curl -s https://storage.googleapis.com/kubernetes-release/release/stable.txt)/bin/darwin/amd64/kubectl && chmod +x ./kubectl && sudo mv ./kubectl /usr/local/bin/kubectl
	
######7.2 Verify kubectl installation by executing the following command
	$ kubectl
	
####8. Creating First Cluster
-------------
######8.1 Execute the following command from the terminal
	$ minikube start

######8.2 Verfiy the minikube cluster by following the command
	$ eval $(minikube docker-env)
	$ docker ps
	$ minikube status
	
######8.3 You can stop the minikube cluster using the following command 
	$ minikube stop
	
####9. Understanding the Kubernetes Dashboard
--------

######9.1 First find the ip of the minikube by executing the following command
	$ minikube ip
	
######9.2 Open the dashboard page by going to the following url http://<minikube_ip>:30000

######9.3 You can also use the simple command from terminal  to open the dashboard page
	$ minikube dashboard
	
######9.4 Spinning of EchoServer container on Kubernetes
	$ kubectl run hello-minikube --image=gcr.io/google_containers/echoserver:1.4
	
######9.5 Now you can see there are three sections 
			. Deployments
			. Replica Sets
			. Pods

####10 Using Minikube Dashboard
-------
######10.1 Create Application
		a) Using Minikbube Dashboard
		b) Using command line. Run the following command
		$ kubectl create -f kube-deployment.yml

######10.2 Configuring Ports in Kubernetes

######10.3 Configuring Environment Variables in Kubernetes

######10.4 Scaling your microservice in Kubernetes

######10.5 Destroying your microservice in Kubernetes

######10.6 Monitoring your microservice logs in Kubernetes

	
