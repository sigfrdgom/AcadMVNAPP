#!/bin/bash
# -*- ENCODING: UTF-8 -*-

#/var/lib/jenkins/workspace/sigfridPipeline
echo funciona por favor....................................................................................................................................................

cd /var/lib/jenkins/workspace/sigfridPipeline/libreria && mvn clean install
echo termino libreria
cd /var/lib/jenkins/workspace/sigfridPipeline/proyecto && mvn clean install
echo termino enterprise
cd /var/lib/jenkins/workspace/sigfridPipeline/proyecto/CasosAcadAppMvn-ear/target/ && cp CasosAcadAppMvn-ear-1.0-SNAPSHOT.ear /var/lib/jenkins/workspace/sigfridPipeline/compose/glassfish/
echo copio el ear
cd /var/lib/jenkins/workspace/sigfridPipeline/compose/
#docker-compose stop
#echo error si no esta activo
#docker rm compose_glassfish_1
#echo eliminando viejo contenedor
#cd /var/lib/jenkins/workspace/sigfridPipeline/compose/glassfish/
#./glass.sh
#echo contruyendo la nueva imagen
#cd /var/lib/jenkins/workspace/sigfridPipeline/compose/
#docker-compose up
#echo finalizo con exito


