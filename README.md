# Android Application NBA TEAM :

By Joseph William Pötgens Folla

## Présentation :

NBA TEAM est une application sous Android studio permettant d'afficher toutes les équipes de baskett-ball en NBA ainsi que le nom de leurs Stade.
   

## Éléments :

* Architecture MVC
* Création d'une API
* Appel WebService à une API Rest.
* Recycler View
* Card View
* Picasso
* Glide
* Gitflow
* Animation
* Splash Screen


## Architecture :

* Controller
	- Team
	- TeamAPI
* Model
	- Item
	- ItemResponse 
* View
    - ItemAdapter
    - MainActivity
    - NbaSplash
    - TeamDetailActivity

### Appel WebService à  une API Rest:

Lien vers l'API : https://github.com/JosephWilliamPF/JosephWilliamPF.github.io/blob/master/apinba.Json

Je fais appel à une API que j'ai créé qui regroupe : 
* abbreviation : abbréviation du nom de l'équipe 
* name : nom de l'équipe
* simplename : nom simplifier de l'équipe
* location : nom de la ville de l'équipe
* arena : nom du stade officiel de l'équipe
* logo : lien vers l'image en format .png du logo de l'équipe

La structure de mon API est la suivante:

```
{
	"count":30,

	"results":[IMG_1.gif

	{
        "abbreviation": "ATL",
        "name": "Atlanta Hawks",
        "simplename": "Hawks",
        "location": "Atlanta, Georgia",
        "arena": "Philips Arena",
        "logo":"https://sportslogohistory-tvgu1jdkm2wvqi.netdna-ssl.com/wp-content/uploads/2016/SLH/nba_primary/atlanta_hawks.png"
	},
	….
}

```

### RecyclerView:
Ici la recycler View permet d’afficher:
- Le nom de toutes les équipes
- Le nom de la ville de l'équipe
- L’affichage du logo de l'équipe

### Faire GitFlow:
Le GItFlow à été développé avec GitKraken et contient une branche :
	- master
	

### Animation:

* Splash Screen :
Lorsque l’on ouvre l'application, la première activité qui s'affiche est une introduction qui dure 5 secondes.

![IMG_1](https://github.com/JosephWilliamPF/MyNbaApplicationVO/blob/master/NbaScreen/NbaTeam.gif)

![IMG_3](https://github.com/JosephWilliamPF/MyNbaApplicationVO/blob/master/NbaScreen/Refreshed.gif)








