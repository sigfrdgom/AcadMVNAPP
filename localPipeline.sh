#!/bin/bash
# -*- ENCODING: UTF-8 -*-

echo funciona por favor....................................................................................................................................................

cd /home/sigfrid/tarea2/nS && mvn clean install
echo termino libreria
cd /home/sigfrid/tarea2/Acad &&mvn clean install
echo termino enterprise
cd /home/sigfrid/tarea2/Acad/CasosAcadAppMvn-ear/target/ && cp CasosAcadAppMvn-ear-1.0-SNAPSHOT.ear /home/sigfrid/tarea2/compose/glassfish/
echo copio el ear
cd /home/sigfrid/tarea2/compose/ && docker-compose stop
echo error si no esta activo
docker rm compose_glassfish_1
echo eliminando viejo contenedor
cd /home/sigfrid/tarea2/compose/glassfish/ && ./glass.sh
echo contruyendo la nueva imagen
cd /home/sigfrid/tarea2/compose/ && docker-compose up -d
echo finalizo con exito


