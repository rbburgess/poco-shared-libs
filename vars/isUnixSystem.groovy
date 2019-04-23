#!/usr/bin/env groovy

def call() {
  if(isUnix()){
      return true
  }else {
      return false
  }
}