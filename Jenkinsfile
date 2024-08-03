pipeline
{
	agent any
	tools
	{
		maven "MAVEN_HOME"
	}
	stages
	{
		stage('welcome stage')
		{
			steps
			{
				echo 'welcome to pipeline'
			}
		}
		stage('Clean stage')
		{
			steps
			{
				bat 'mvn clean'
			}
		}
		stage('Build stage')
		{
			steps
			{
				bat 'mvn install'
			}
		}
		stage('Success stage')
		{
			steps
			{
				echo 'built succesfully completed'
			}
		}
	}
}