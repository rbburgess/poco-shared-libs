#!/usr/bin/env groovy
package com.poco

class GlobalVars {
   static String foo = "bar"
   static Boolean isUnixSystem = isUnix()
   // refer to this in a pipeline using:
   //
   // import com.cleverbuilder.GlobalVars
   // println GlobalVars.foo
}