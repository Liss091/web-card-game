package ua.od.game.controller.impl;

import ua.od.game.controller.AccountUpgradeController;
import ua.od.game.dto.AccountUpgradeDto;
import ua.od.game.service.AccountUpgradeService;

import javax.inject.Inject;
import javax.ws.rs.core.Response;
import java.util.List;

public class AccountUpgradeControllerImpl implements AccountUpgradeController {
    @Inject
    public AccountUpgradeService accountUpgradeService;

    @Override

    public Response clearAccountUpgradeList(Integer accountId) {
        accountUpgradeService.clearAccountUpgradeList(accountId);
        return null;
    }

    @Override
    public List<AccountUpgradeDto> getAccountUpgradeList(Integer accountId) {
        return accountUpgradeService.getAccountUpgradeList(accountId);
    }
}
