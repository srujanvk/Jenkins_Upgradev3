job('First-Maven-Project-DSL') {
    Description("First Maven project job via DSL on ${new Date()}, ths project is small maven project on github")
    scm {
        git("git@github.com:srujanvk/Jenkins_Upgradev3.git",'master')
    }
    triggers{
        scm('* * * * *')
    }
    steps{
        maven('clean package', 'maven-samples/single-module/pom.xml')
    }
    publishers {
        archiveArtifacts '**/*.jar'
    }
}
