# Teach Alexa the Candlelightning times

## Set UP
* install eclipse with java 8 environment
* import this git repo as Maven repository
* run maven build on pom.xml

Right now the project tree is supposed to be without any errors 

## ToDos
### Step 1
* Get RestAPI Calls inside the helper Class for São Paulo, Brazil by calling `https://www.hebcal.com/shabbat/?cfg=json&geonameid=3448439&m=50`
* parse the result items in three [four] categories (parasha, candlelight, havdala [, holidays])
* wrtiting unittest for the Helper class

* create three Handlers
** one for this weeks Parasha
** one for candlelight times
** one for havdala / shabbat end times

* wrtiting unittest for the Handlers

### Step 2
* edit the `model.json` file by adding the three new intents (parasha, candlelight, havdala)

### Step 3
* upload jar to Lambda and view results.
* if everything working as expected, repeat step one with geonameid based on alexa device location