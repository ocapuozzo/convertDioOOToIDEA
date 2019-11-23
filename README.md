# convertDioOOToIDEA
convert dico libre office for IDE intellij

convertir un dico https://github.com/LibreOffice/dictionaries/blob/master/fr_FR/fr.dic
en un dico accepté par intellij

ce qui est fait actuellement (premier jet) 

- séquence/S. 

donne

- séquence
- séquences

idem avec les x

TODO voir les apstrophes et autres
   
Exemple usage : java -jar convertDicoOOToIDEA.jar /home/kpu/Documents/dico/fr-oo.dic > newfr.dic

puis add dictionnaire dans l'ide :  https://www.jetbrains.com/help/idea/spellchecking.html
