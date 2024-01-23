package com.u2team.huansync.ticketOffice.tickets.model.classes.builders;

import com.u2team.huansync.ticketOffice.tickets.model.classes.StatusEnum;
import com.u2team.huansync.ticketOffice.tickets.model.classes.Tickets;

public class TicketConcreteBuilder implements TicketBuilder{

    private Tickets tickets = new Tickets();

    @Override
    public TicketBuilder ticketId(long ticketId) {
        tickets.setTicketId(ticketId);
        return this;
    }


    @Override
    public TicketBuilder nameTicket(String nameTicket) {
        tickets.setNameTicket(nameTicket);
        return this;
    }

    @Override
    public TicketBuilder additionalCost(double additionalCost) {
        tickets.setAdditionalCost(additionalCost);
        return this;
    }

    @Override
    public TicketBuilder ticketTypeId(long ticketTypeId) {
        tickets.setTicketTypeId(ticketTypeId);
        return this;
    }

    @Override
    public TicketBuilder customerId(long customerId) {
        tickets.setCustomerId(customerId);
        return this;
    }

    @Override
    public TicketBuilder ticketOfficeId(long ticketOfficeId) {
        tickets.setTicketOfficeId(ticketOfficeId);
        return this;
    }

    @Override
    public TicketBuilder statusEnum(String statusEnum) {
        if (statusEnum.equalsIgnoreCase("reserved")){
            tickets.setStatusEnum(StatusEnum.RESERVED);
        }
        if (statusEnum.equalsIgnoreCase("paid")){
            tickets.setStatusEnum(StatusEnum.PAID);
        }
        return this;
    }


    @Override
    public Tickets buid() {
        return null;
    }

}
