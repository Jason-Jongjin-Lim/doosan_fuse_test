# Doosan Fuse API Proxy


### Building

The example can be built with

    mvn clean install

### Running the example in OpenShift

It is assumed that:
- OpenShift platform is already running, if not you can find details how to [Install OpenShift at your site](https://docs.openshift.com/container-platform/3.3/install_config/index.html).
- Your system is configured for Fabric8 Maven Workflow, if not you can find a [Get Started Guide](https://access.redhat.com/documentation/en/red-hat-jboss-middleware-for-openshift/3/single/red-hat-jboss-fuse-integration-services-20-for-openshift/)
- The OpenShift MySQL container image should already be installed and running on your OpenShift installation, one simple way to run a MySQL service is following the documentation of the Openshift MySQL container image related to the `mysql-ephemeral` template.

The example can then be built and deployed using a single goal:

    $ mvn -s configuration/settings.xml fabric8:deploy -Popenshift -DskipTests

The `username` and `password` system properties correspond to the credentials
used when deploying the MySQL database service.


To list all the running pods:

    oc get pods

Then find the name of the pod that runs this quickstart, and output the logs from the running pods with:

    oc logs <name of pod>

You can also use the OpenShift [web console](https://docs.openshift.com/container-platform/3.3/getting_started/developers_console.html#developers-console-video) to manage the
running pods, and view logs and much more.
