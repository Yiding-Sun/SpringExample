package com.example.server.form

import scala.beans.BeanProperty


case class ThingForm(@BeanProperty id: Long, @BeanProperty name: String, @BeanProperty describe: String) {
}
