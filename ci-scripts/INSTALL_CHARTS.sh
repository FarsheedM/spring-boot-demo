#!/usr/bin/bash

helm upgrade \
	--install \
	--cleanup-on-fail \
	--force \
	--wait \
	--set-string image.repository="backend-demo" \
backend-demo ./helm/backend-demo

