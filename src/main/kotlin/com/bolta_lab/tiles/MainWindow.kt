package com.bolta_lab.tiles

import com.bolta_lab.tiles.divider.Divider
import com.bolta_lab.tiles.color.Color
import com.esri.core.geometry.*
import com.esri.core.geometry.Polygon
import processing.core.PApplet
import processing.core.PConstants
import java.util.*
import kotlin.coroutines.experimental.buildSequence

abstract class MainWindow(protected val params: RenderingParameterSet, protected val outFileName: String) : PApplet() {
	override fun settings() {
		this.size(this.params.size.x.toInt(), this.params.size.y.toInt())
	}
}

