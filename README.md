# UniversityEventManagement
## Create a spring boot project University Event Management using spring Initializer  (link:- https://start.spring.io/ )

## Constraints:
  ### Create a student model and an event Model (Id,name,department,branch,location,description,starttime,endtime,date,imageurl)
### Student model will have-
1. StudentId
2. first name
3. last name
4. age
5. department

### Event Model will have
1. eventId
2. eventName
3. locationOfEvent
4. date
5. startTime
6. endTime

### Endpoints to provided :
1. Add student
 ```
http://localhost:8080/add-student
```
3. update student
 ```
http://localhost:8080/update-student/id/{id}
```
4. delete student
 ```
http://localhost:8080/delete-student/id/{id}
```
5. Get all students 
 ```
http://localhost:8080/find-all
```
6. Get student by Id
 ```
http://localhost:8080/find-by-id/{id}
```
7. Add event
 ```
http://localhost:8080/add-event
```
8. Update event
 ```
http://localhost:8080/update-event/id/{id}
```
9. Delete event
 ```
http://localhost:8080/delete-event/id/{id}
```
10. Get All event
```
http://localhost:8080/find-all-event
```
