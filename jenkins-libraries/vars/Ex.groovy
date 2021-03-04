properties([parameters([[$class: 'ChoiceParameter', choiceType: 'PT_SINGLE_SELECT', description: '', filterLength: 1, filterable: false, name: 'MainOption', randomName: 'choice-parameter-178485151484167', script: [$class: 'GroovyScript', fallbackScript: [classpath: [], sandbox: false, script: ''], script: [classpath: [], sandbox: false, script: 'return [ \'India\' , \'USA\' ]']]], [$class: 'CascadeChoiceParameter', choiceType: 'PT_SINGLE_SELECT', description: '', filterLength: 1, filterable: false, name: 'DependentOption', randomName: 'choice-parameter-178485157802753', referencedParameters: 'MainOption', script: [$class: 'GroovyScript', fallbackScript: [classpath: [], sandbox: false, script: ''], script: [classpath: [], sandbox: false, script: '''def states( MainOption )
{
    if (MainOption.equals( \'India\' )){
         return [\'Delhi\' , \'Maharashtra\' ]
     }
    else if(MainOptions.equals( \'USA\' )){
         return [ \'California\' , \'Florida\' ]
    }
   else{
     return [\'N/A\']    
}
}''']]], [$class: 'CascadeChoiceParameter', choiceType: 'PT_SINGLE_SELECT', description: '', filterLength: 1, filterable: false, name: 'LastOption', randomName: 'choice-parameter-178485164279961', referencedParameters: 'DependentOption', script: [$class: 'GroovyScript', fallbackScript: [classpath: [], sandbox: false, script: ''], script: [classpath: [], sandbox: false, script: '''def cities( DependentOption ){
    if(DependentOption.equals( \'Delhi\')){
         return [ \'Tughlaqabad\' , \'Firozabad\']
    }
   else if (DependentOption.equals( \'Maharashtra\' )){
          return [\'Pune\', \'Solapur\']
    } 
   else if ( DependentOption.equals( \'California\')){
        return [ \'San Francisco\' , \'Los Angeles\' ] 
}  
   else if (DependentOption.equals( \'Florida\')){
    return [\'Miami\' , \'Hialeah\' ]
    }
    else 
         return [\'N/A\']
}''']]]])])