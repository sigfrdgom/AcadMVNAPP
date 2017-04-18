#!/bin/bash
# -*- ENCODING: UTF-8 -*-

echo funciona por favor....................................................................................................................................................

cd /home/sigfrid/acadMVNAPP/libreria && mvn clean install
echo termino libreria
cd /home/sigfrid/acadMVNAPP/proyecto &&mvn clean install
echo termino enterprise
cd /home/sigfrid/acadMVNAPP/proyecto/CasosAcadAppMvn-ear/target/ && cp CasosAcadAppMvn-ear-1.0-SNAPSHOT.ear /home/sigfrid/acadMVNAPP/compose/glassfish/
echo copio el ear
cd /home/sigfrid/acadMVNAPP/compose/ && docker-compose stop
echo error si no esta activo
docker rm compose_glassfish_1
echo eliminando viejo contenedor
cd /home/sigfrid/acadMVNAPP/compose/glassfish/ && ./glass.sh
echo contruyendo la nueva imagen
cd /home/sigfrid/acadMVNAPP/compose/ && docker-compose up -d
echo finalizo con exito


