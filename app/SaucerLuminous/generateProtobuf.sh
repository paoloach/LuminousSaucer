#!/usr/bin/env sh

protoc --plugin=protoc-gen-grpckt=protoc-gen-grpc-kotlin.sh --plugin=protoc-gen-grpc=protoc-gen-grpc-java.sh  --grpckt_out="app/src/main/java"  --gprc_out="app/src/main/java"  --proto_path=./app/src/proto/  api.proto
