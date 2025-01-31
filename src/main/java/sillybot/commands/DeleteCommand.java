package sillybot.commands;

import sillybot.Storage;
import sillybot.Ui;
import sillybot.tasks.TaskList;

/**
 * Represents a DeleteCommand object that handles the delete command.
 */
public class DeleteCommand extends Command {
    private final int taskNumber;

    /**
     * Creates a DeleteCommand object.
     *
     * @param taskNumber The index of the task to be deleted.
     */
    public DeleteCommand(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    /**
     * Executes the DeleteCommand object.
     *
     * @return The response to be displayed to the user.
     */
    @Override
    public String execute(TaskList tasks, Ui ui, Storage storage) throws Exception {
        String response;

        try {
            response = ui.deleteTaskMessage(tasks.get(this.taskNumber));
            tasks.deleteTask(this.taskNumber);
            storage.save(tasks);
        } catch (IndexOutOfBoundsException e) {
            throw new Exception("delete what eh! ");
        }

        return response;
    }
}
