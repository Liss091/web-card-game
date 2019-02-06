package ua.od.game.service.impl;

import ua.od.game.model.AccountUpgradeEntity;
import ua.od.game.repository.dao.AccountUpgradeDao;

import javax.inject.Inject;
import java.util.List;

public class AccountUpgradeServiceImpl implements AccountUpgradeDao {

    @Inject
    AccountUpgradeDao accountUpgradeDao;

    @Override
    public Boolean clearAccountUpgradeList(Integer accountId) {
        return accountUpgradeDao.clearAccountUpgradeList(accountId);
    }

    @Override
    public List<AccountUpgradeEntity> getAccountUpgradeList(Integer accountId) {
        return accountUpgradeDao.getAccountUpgradeList(accountId);
    }
}
