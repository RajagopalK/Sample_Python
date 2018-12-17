@Grab('org.yaml:snakeyaml:1.17')
import org.yaml.snakeyaml.Yaml
import hudson.model.*

node {
stage ("Start"){
    try{
    Yaml parser = new Yaml()
    def datas = parser.load(("D:/Raja/RAJA/Python/sample/kandavel.yml" as File).text)
    build{msg= datas.get("general").getAt("job_name")}
}
catch(Exception e)
{
     e.printStackTrace()
}
    stage ("End"){
        echo "Last"
    }
  }
}
