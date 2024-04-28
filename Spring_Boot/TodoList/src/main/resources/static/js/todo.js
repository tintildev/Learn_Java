// Funktion zum Laden der Todos beim Seitenaufruf
function loadTodos() {
    fetch('/loadAllTodos')
        .then(response => {
            if (!response.ok) {
                throw new Error('Fehler beim Laden der Todos');
            }
            return response.json(); // Die Antwort als JSON parsen
        })
        .then(todos => {
            // Die geladenen Todos verarbeiten und anzeigen
            displayTodos(todos);
        })
        .catch(error => {
            console.error('Fehler:', error);
            // Fehlerbehandlung, z.B. eine Fehlermeldung anzeigen
        });
}

// Funktion zum Anzeigen der geladenen Todos
function displayTodos(todos) {
    var todoListElement = document.getElementById('toDoList');
    // Zuerst alle vorhandenen Todos löschen
    todoListElement.innerHTML = '';
    // hinzufügen
    todos.forEach(todo => {
        var todoElement = document.createElement('div');
        todoElement.className = 'todo';
        todoElement.textContent = todo.todo;
        todoListElement.appendChild(todoElement);
    });
}

// beim Seitenaufruf die Todos zu laden
loadTodos();


//Speichern der neuen Todos
document.getElementById('todoForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Standard-Aktion des Formulars verhindern (Seite neu laden)

    let todoInput = document.getElementById('todoInput').value;

    fetch('/addTodo', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({todo: todoInput, completed: false})
    })

    //Neu Laden der Todos
    loadTodos();
});