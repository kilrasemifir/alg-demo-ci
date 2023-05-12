# Projet Demo ALG CI

Exemple d'utilisateur de Kubernetes et de GithubActions pour le déploiement.

## Prérequis

- [K3D](https://k3d.io/)
- [Helm](https://helm.sh/)

## Installation

### Lancer un cluster K3D

```bash
k3d cluster create alg-demo-ci -p 8080:80@loadbalancer
```

Vous pouvez vérifier que le cluster est bien lancé avec la commande suivante :

```bash
kubectl cluster-info
```

### Deployer MongoDB

```bash
helm install --set auth.enabled=false mongo oci://registry-1.docker.io/bitnamicharts/mongodb
```

### Déployer l'application

```bash
kubectl apply -f demo-kube.yml
```

### Vérifier le déploiement

```bash
kubectl get pods
```

Vous devriez voir un pod `alg-demo-ci-<hash>` en état `Running`.


### Utilisation

Vous pouvez voir votre application en vous rendant sur [http://localhost:8080](http://localhost:8080).

Vous pouvez interagir avec l'api acteur sur la route `/acteurs`.

## Stopper le cluster

Pour supprimer le cluster, vous pouvez utiliser la commande suivante :
```bash
k3d cluster delete alg-demo-ci
```

Pour l'arrêter, vous pouvez utiliser la commande suivante :
```bash
k3d cluster stop alg-demo-ci
```

## Supprimer les ressources

```bash
kubectl delete -f demo-kube.yml # Supprime l'application
helm uninstall mongo # Supprime MongoDB
```