#!/usr/bin/bash

helm upgrade \
	--dry-run \
	--install \
	--cleanup-on-fail \
	--force \
	--wait \
 	--set-string image.repository="backend-demo" \
	backend-demo ./helm/backend-demo

mkdir -p artifacts/helm

helm template \
	--output-dir artifacts/helm \
	backend-demo ./helm/backend-demo
