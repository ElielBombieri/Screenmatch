from pathlib import Path

path = Path( src/main/java/br/com/kael/screenmatch/ScreenmatchApplication.java)
text = path.read_text()
old = '        String json = consumoApi.obterDados( http://www.omdbapi.com/?t=gilmore+girls&Season=1&apikey=b4813b59);'
new = '        String json = consumoApi.obterDados(http://www.omdbapi.com/?t=gilmore+girls + chr(38) + Season=1 + chr(38) + apikey=b4813b59);'
path.write_text(text.replace(old, new), encoding='utf-8')
