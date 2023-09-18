# OpenAPI generated server

Spring Boot Server 


## Overview  
This server was generated by the [OpenAPI Generator](https://openapi-generator.tech) project.
By using the [OpenAPI-Spec](https://openapis.org), you can easily generate a server stub.
This is an example of building a OpenAPI-enabled server in Java using the SpringBoot framework.

The underlying library integrating OpenAPI to SpringBoot is [springfox](https://github.com/springfox/springfox)

Start your server as a simple java application

You can view the api documentation in swagger-ui by pointing to  
http://localhost:8080/

Change default port value in application.properties

oc apply -k config/ocp-gitops/operator

Once ArgoCD is up & running, let's install the remaining dependencies

$ oc apply -k config/ocp-pipelines/argocd

Create a new project:
$ oc new-project fuse-jdbc-demo

Install tekton pipeline components:
oc apply -k tekton/

Run the pipeline via the Web UI 

Deploy ArgoCD applications:
oc apply -k argocd/hqoas-spring

And wait for the deployment to show

oc get deployment -n hqoas-jdbc-demo

Expose the service to the public 
oc expose svc hqoas-spring-java-runner-service-v1

You can then discover the url by typing
oc get routes

Copy the host field and go check that out
