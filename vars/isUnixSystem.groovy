#!/usr/bin/env groovy

def call() {
  if(isUnix()){
      echo 'Unix'
  }else {
      echo 'Windows'
  }
}