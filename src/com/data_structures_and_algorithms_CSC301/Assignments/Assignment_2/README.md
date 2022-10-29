In this programming assignment you will practice the use of Stack, Queue, and Priority
Queue data structures to solve a real-life problem. You are requested to implement a
simple Task management system that can be used in different types of real-life
applications in various industry areas such as banks, factories, online shopping, … For
example, if we consider an automated industrial systems where various tasks need to be
executed by robots, a master controller needs to manage the tasks and assign them to
the slave robots. Some tasks have higher priority than others, and some tasks must be
executed with a First-In-First-Served approach.
To simplify this programming assignment, each task will be an arithmetic expression to
be executed. For example, once running the task "100+20+50*10” it will give the result
1700, Tasks have priority assigned to them.
      1- (1 mark) Design your classes and implement them. Your design logic should make
      sense. Use interfaces, abstract classes, inheritance if needed.
      2- (4 marks) Implement a simple application that manages the tasks stored in
      appropriate data structures: Stack, Queue, and PriorityQueue. Your design and
      program should be efficient and allows handling a large number of tasks. Your
      program must implement the below methods:
1. **Create Task**: creates a new task and specifies what the task will do. It also
   initialises any necessary field of the task. // done
2. **Run Tasks**: User specifies how many tasks to be executed. The next available
   tasks are executed first based on priority. We will distinguish between two
   categories of tasks. Tasks having priorities assigned to them must be run first
   based on the order of their priorities. Tasks without a priority assigned to them
   will run in FIFO order after running all higher priority tasks.
3. **Raise Priority**: This function will raise the priority of all tasks assigned to a
   specific slave robot making them hence run first.
4. **Lower Priority**: This function will lower the priority of all tasks created on a
   specific time making them hence run in FIFO order.
5. **Display Tasks**: Displays all tasks in the order of their priorities and providing their
   status. Status can be Executed or Pending. For executed tasks, you need to
   display their results.
6. **Bonus Mark Functions**: If you implement efficiently the bonus mark functions
      you will get 2.5 extra marks.
      a. Cancel a task: cancels a pending task. Can be called multiple times and
      it will cancel the specified tasks, but it stores them somewhere so that
      they can be uncancelled.
      b. Uncancel a task: returns the most recent cancelled task to its queue. Can
      be called multiple times and it will uncancel previously cancelled tasks in
      the order of their cancellation. Like the UNDO in WORD.