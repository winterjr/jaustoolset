/*
 * ex: set ro:
 * DO NOT EDIT.
 * generated by smc (http://smc.sourceforge.net/)
 * from file : Events_SendFSM.sm
 */

#include "urn_jaus_jss_core_Events_1_1/Messages/MessageSet.h"
#include "urn_jaus_jss_core_Events_1_1/Events_SendFSM.h"
#include "include/urn_jaus_jss_core_Events_1_1/Events_SendFSM_sm.h"

using namespace statemap;

namespace urn_jaus_jss_core_Events_1_1
{
    // Static class declarations.
    Events_SendFSM_SM_Sending Events_SendFSM_SM::Sending("Events_SendFSM_SM::Sending", 0);
    Events_SendFSM_SM_Internally_Generated_State_DO_NOT_USE Events_SendFSM_SM::Internally_Generated_State_DO_NOT_USE("Events_SendFSM_SM::Internally_Generated_State_DO_NOT_USE", 1);

    void Events_SendFSMState::BroadcastGlobalTransition(Events_SendFSMContext& context)
    {
        Default(context);
        return;
    }

    void Events_SendFSMState::BroadcastLocalTransition(Events_SendFSMContext& context)
    {
        Default(context);
        return;
    }

    void Events_SendFSMState::CancelEventTransition(Events_SendFSMContext& context)
    {
        Default(context);
        return;
    }

    void Events_SendFSMState::CommandCompletedTransition(Events_SendFSMContext& context)
    {
        Default(context);
        return;
    }

    void Events_SendFSMState::CommandExpiredTransition(Events_SendFSMContext& context)
    {
        Default(context);
        return;
    }

    void Events_SendFSMState::CreateCommandEventTransition(Events_SendFSMContext& context)
    {
        Default(context);
        return;
    }

    void Events_SendFSMState::CreateEvntTransition(Events_SendFSMContext& context)
    {
        Default(context);
        return;
    }

    void Events_SendFSMState::EventErrorTransition(Events_SendFSMContext& context)
    {
        Default(context);
        return;
    }

    void Events_SendFSMState::EventOccurredTransition(Events_SendFSMContext& context)
    {
        Default(context);
        return;
    }

    void Events_SendFSMState::QueryEventTimeoutTransition(Events_SendFSMContext& context)
    {
        Default(context);
        return;
    }

    void Events_SendFSMState::QueryEventsTransition(Events_SendFSMContext& context)
    {
        Default(context);
        return;
    }

    void Events_SendFSMState::ReceiveTransition(Events_SendFSMContext& context)
    {
        Default(context);
        return;
    }

    void Events_SendFSMState::SendTransition(Events_SendFSMContext& context)
    {
        Default(context);
        return;
    }

    void Events_SendFSMState::TimeoutTransition(Events_SendFSMContext& context)
    {
        Default(context);
        return;
    }

    void Events_SendFSMState::UpdateEventTransition(Events_SendFSMContext& context)
    {
        Default(context);
        return;
    }

    void Events_SendFSMState::Default(Events_SendFSMContext& context)
    {
        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "TRANSITION   : Default"
                << std::endl;
        }

        throw (
            TransitionUndefinedException(
                context.getState().getName(),
                context.getTransition()));

        return;
    }

    void Events_SendFSM_SM_Internally_Generated_State_DO_NOT_USE::BroadcastGlobalTransition(Events_SendFSMContext& context)
    {

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "TRANSITION   : Events_SendFSM_SM BroadcastGlobalTransition()"
                << std::endl;
        }


        return;
    }

    void Events_SendFSM_SM_Internally_Generated_State_DO_NOT_USE::BroadcastLocalTransition(Events_SendFSMContext& context)
    {

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "TRANSITION   : Events_SendFSM_SM BroadcastLocalTransition()"
                << std::endl;
        }


        return;
    }

    void Events_SendFSM_SM_Internally_Generated_State_DO_NOT_USE::CancelEventTransition(Events_SendFSMContext& context)
    {

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "TRANSITION   : Events_SendFSM_SM CancelEventTransition()"
                << std::endl;
        }


        return;
    }

    void Events_SendFSM_SM_Internally_Generated_State_DO_NOT_USE::CommandCompletedTransition(Events_SendFSMContext& context)
    {

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "TRANSITION   : Events_SendFSM_SM CommandCompletedTransition()"
                << std::endl;
        }


        return;
    }

    void Events_SendFSM_SM_Internally_Generated_State_DO_NOT_USE::CommandExpiredTransition(Events_SendFSMContext& context)
    {

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "TRANSITION   : Events_SendFSM_SM CommandExpiredTransition()"
                << std::endl;
        }


        return;
    }

    void Events_SendFSM_SM_Internally_Generated_State_DO_NOT_USE::CreateCommandEventTransition(Events_SendFSMContext& context)
    {

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "TRANSITION   : Events_SendFSM_SM CreateCommandEventTransition()"
                << std::endl;
        }


        return;
    }

    void Events_SendFSM_SM_Internally_Generated_State_DO_NOT_USE::CreateEvntTransition(Events_SendFSMContext& context)
    {

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "TRANSITION   : Events_SendFSM_SM CreateEvntTransition()"
                << std::endl;
        }


        return;
    }

    void Events_SendFSM_SM_Internally_Generated_State_DO_NOT_USE::EventErrorTransition(Events_SendFSMContext& context)
    {

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "TRANSITION   : Events_SendFSM_SM EventErrorTransition()"
                << std::endl;
        }


        return;
    }

    void Events_SendFSM_SM_Internally_Generated_State_DO_NOT_USE::EventOccurredTransition(Events_SendFSMContext& context)
    {

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "TRANSITION   : Events_SendFSM_SM EventOccurredTransition()"
                << std::endl;
        }


        return;
    }

    void Events_SendFSM_SM_Internally_Generated_State_DO_NOT_USE::QueryEventTimeoutTransition(Events_SendFSMContext& context)
    {

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "TRANSITION   : Events_SendFSM_SM QueryEventTimeoutTransition()"
                << std::endl;
        }


        return;
    }

    void Events_SendFSM_SM_Internally_Generated_State_DO_NOT_USE::QueryEventsTransition(Events_SendFSMContext& context)
    {

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "TRANSITION   : Events_SendFSM_SM QueryEventsTransition()"
                << std::endl;
        }


        return;
    }

    void Events_SendFSM_SM_Internally_Generated_State_DO_NOT_USE::ReceiveTransition(Events_SendFSMContext& context)
    {

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "TRANSITION   : Events_SendFSM_SM ReceiveTransition()"
                << std::endl;
        }


        return;
    }

    void Events_SendFSM_SM_Internally_Generated_State_DO_NOT_USE::SendTransition(Events_SendFSMContext& context)
    {

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "TRANSITION   : Events_SendFSM_SM SendTransition()"
                << std::endl;
        }


        return;
    }

    void Events_SendFSM_SM_Internally_Generated_State_DO_NOT_USE::TimeoutTransition(Events_SendFSMContext& context)
    {

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "TRANSITION   : Events_SendFSM_SM TimeoutTransition()"
                << std::endl;
        }


        return;
    }

    void Events_SendFSM_SM_Internally_Generated_State_DO_NOT_USE::UpdateEventTransition(Events_SendFSMContext& context)
    {

        if (context.getDebugFlag() == true)
        {
            std::ostream& str = context.getDebugStream();

            str << "TRANSITION   : Events_SendFSM_SM UpdateEventTransition()"
                << std::endl;
        }


        return;
    }
}

/*
 * Local variables:
 *  buffer-read-only: t
 * End:
 */