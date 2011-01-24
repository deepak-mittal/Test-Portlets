$LIFERAY_HOME/tomcat-6.0.18/bin/shutdown.sh
mkdir -p ~/.grails/1.3.6/projects/testPortlets/stage/WEB-INF/lib
grails war #--nojars
$LIFERAY_HOME/tomcat-6.0.18/bin/startup.sh
cp target/testPortlets-0.1.war  $LIFERAY_HOME/deploy/DEPLOY_TO__test-portlet2.war
