# InterviewProject

Features:
CRUD


Sorting by id, name, description, due date, state:

localhost:8080/api/v1/get/toDoLists/date

Filtering by getting specific status, getting items before certain date:

localhost:8080/api/v1/get/toDoLists/date/2023-01-01
localhost:8080/api/v1/get/toDoLists/status/pending


Data validation (all attributes should not be blank)

Layer architecture (controller, service, repository layer)

Skills used:
OOP
Beans
JSON
Java Bean Validation
Dependency Injection
Spring Data JPA
Exception Handling
Lombok

Populate Database for testing:

insert into TO_DO_LIST (ID, DESCRIPTION, DUE_DATE, NAME, STATUS) values (1, 'finish math assignment', '2022-01-02', 'math', 'pending');
insert into TO_DO_LIST (ID, DESCRIPTION, DUE_DATE, NAME, STATUS) values (2, 'guitar practice', '2024-01-02', 'music', 'pending');
insert into TO_DO_LIST (ID, DESCRIPTION, DUE_DATE, NAME, STATUS) values (3, 'finish English assignment', '2024-02-04', 'English', 'pending');
insert into TO_DO_LIST (ID, DESCRIPTION, DUE_DATE, NAME, STATUS) values (4, 'finish physics assignment', '2022-01-03', 'Physics', 'done');
insert into TO_DO_LIST (ID, DESCRIPTION, DUE_DATE, NAME, STATUS) values (5, 'another task', '2024-04-01', 'Task', 'done');
insert into TO_DO_LIST (ID, DESCRIPTION, DUE_DATE, NAME, STATUS) values (6, 'doing exercise', '2022-05-02', 'Exercise', 'wip');
insert into TO_DO_LIST (ID, DESCRIPTION, DUE_DATE, NAME, STATUS) values (7, 'finish group project', '2024-01-02', 'Project', 'wip');
insert into TO_DO_LIST (ID, DESCRIPTION, DUE_DATE, NAME, STATUS) values (8, 'doing report', '2023-06-02', 'Report', 'done');
insert into TO_DO_LIST (ID, DESCRIPTION, DUE_DATE, NAME, STATUS) values (9, 'programming', '2022-03-04', 'Coding', 'pending');


For updating date:

{
    "name": "Workout",
    "description": "play basketball",
    "dueDate": "2022-09-09",
    "status": "pending"
}
