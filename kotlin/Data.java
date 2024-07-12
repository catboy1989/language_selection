public class Data {
private int id;
private String description;
private int priority;

public Data(int id, String description, int priority) {
this.id = id;
this.description = description;
this.priority = priority;
}

public void setId(int id) {
this.id = id;
}

public int getId() {
return id;
}

public void setDescription(String description) {
this.description = description;
}

public String getDescription() {
return description;
}

public void setPriority(int priority) {
this.priority = priority;
}

public float getPriority() {
return priority;
}

@Override
public int hashCode() {
final int prime = 31;
int result = 1;
result = Integer.hashCode(this.id) * prime;
result = prime * result + Integer.hashCode(this.priority);
result = prime * result + ((this.description == null) ? 0 : this.description.hashCode());
return result;
}

@Override
public boolean equals(Object var1) {
if (this != var1) {
if (var1 instanceof Task) {
Task var2 = (Task) var1;
if (this.id == var2.id
&& Intrinsics.areEqual(this.description, var2.description)
&& this.priority == var2.priority) {
return true;
}
}
return false;
} else {
return true;
}
}

@Override
public String toString() {
return "Task [id=" + id + ", description=" + description + ", priority=" + priority + "]";
}
}