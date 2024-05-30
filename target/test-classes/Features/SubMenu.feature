#Author: Yassine

Feature: SubMenu
Scenario: choisir un sous menu
Given Utilisateur en page dacceuil
When utilisateur survole la souris sur le menu "Smart Home"
And utilisateur choisis "Maison connectée"
Then utilisateur se derige vers la page qui contient "Maison connectée"