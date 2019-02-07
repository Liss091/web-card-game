package ua.od.game.controller.impl;

import ua.od.game.controller.AccountUpgradeController;
import ua.od.game.dto.AccountUpgradeDto;
import ua.od.game.service.AccountUpgradeService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/account")
public class AccountUpgradeControllerImpl implements AccountUpgradeController {
    @Inject
    public AccountUpgradeService accountUpgradeService;

    @Override
    @GET
    @Path("/{accountId}")
    public Response clearAccountUpgradeList(@PathParam("accountId") Integer accountId) {
        if (accountUpgradeService.clearAccountUpgradeList(accountId)) return Response.status(200).build();
        else return Response.status(500).build();
    }

    @Override
    @GET
    @Path("/upgrade/{accountId}")
    public List<AccountUpgradeDto> getAccountUpgradeList(@PathParam("accountId") Integer accountId) {
        return accountUpgradeService.getAccountUpgradeList(accountId);
    }
}
