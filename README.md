# TP-FRAMEWORK - Suivi de Dépenses

Ce projet est une application complète de **suivi de dépenses** composée de deux parties distinctes :

## 🔧 Backend - API REST avec Spring Boot

Le backend est une **API REST** développée avec **Spring Boot**.  
Il permet de gérer les opérations suivantes :

- Création, modification, suppression de dépenses
- Filtrage et total des dépenses
- Connexion avec une base de données **MySQL**

### 📁 Structure backend
Le code source du backend se trouve dans le dossier : `expensetracker/`

## 🌐 Frontend - Application React JS

L’interface utilisateur est réalisée avec **React JS**.  
Elle permet :

- D’afficher la liste des dépenses
- D’ajouter, filtrer, et supprimer des dépenses
- D’obtenir un résumé des dépenses

### 📁 Structure frontend
Le code source du frontend est situé dans le dossier : `suivi-depenses/`

---

## 📦 Technologies utilisées

- **Spring Boot** (API REST)
- **MySQL** (Base de données)
- **React JS** (Frontend)
- **Maven** (Gestionnaire de dépendances)
- **Git & GitHub** (Contrôle de version)

---

## 🚀 Lancement du projet

### Backend

```bash
cd expensetracker
./mvnw spring-boot:run
FRONT
cd suivi-depenses
npm install
npm start
