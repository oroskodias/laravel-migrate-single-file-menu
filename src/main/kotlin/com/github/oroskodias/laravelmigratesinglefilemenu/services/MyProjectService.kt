package com.github.oroskodias.laravelmigratesinglefilemenu.services

import com.intellij.openapi.project.Project
import com.github.oroskodias.laravelmigratesinglefilemenu.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
