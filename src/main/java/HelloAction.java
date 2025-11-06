import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;

public class HelloAction extends AnAction {
    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        // This method is called when the menu item is clicked
        Messages.showInfoMessage("(=^･ω･^=) Plugin is working!", "My Plugin");
    }
}