package com.knoldus.quetzal

import com.ibm.research.rdf.store.query
import com.ibm.research.rdf.store.sparql.Parser

class Quetzal {
  def main(args: Array[String]) {
    println("Quetzal Postgres")
    val sql = Parser.toSQLQuery("select count(*) {  ?s ?p ?o }")
    println("sql query is " + sql)
  }
}