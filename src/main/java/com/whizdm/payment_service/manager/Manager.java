package com.whizdm.payment_service.manager;

import com.whizdm.payment_service.dao.DaoLoanDisbursal;
import com.whizdm.payment_service.dao.DaoLoanPayment;
import com.whizdm.payment_service.dao.DaoLoanPaymentSchedule;
import com.whizdm.payment_service.entity.PaymentScheduleLos;
import com.whizdm.payment_service.entity.UserEmiDetails;


public class Manager implements ManagerInterface {


    private DaoLoanDisbursal daoLoanDisbursal;
    private DaoLoanPayment daoLoanPayment;
    private DaoLoanPaymentSchedule daoLoanPaymentSchedule ;


    public Manager(DaoLoanDisbursal daoLoanDisbursal, DaoLoanPayment daoLoanPayment, DaoLoanPaymentSchedule daoLoanPaymentSchedule) {
        this.daoLoanDisbursal = daoLoanDisbursal;
        this.daoLoanPayment = daoLoanPayment;
        this.daoLoanPaymentSchedule = daoLoanPaymentSchedule;
    }

    @Override
    public void disbursal(PaymentScheduleLos paymentScheduleLos) {

    }

    @Override
    public int amountRoundOff(double amount) {
        return 0;
    }

    @Override
    public void saveRepaymentSchedule(PaymentScheduleLos paymentScheduleLos) {

    }

    @Override
    public boolean dueAmountValidation(UserEmiDetails userEmiDetails) {
        return false;
    }

    @Override
    public void acceptPayment(UserEmiDetails userEmiDetails) {

    }
}

